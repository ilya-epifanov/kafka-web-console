package controllers

import play.api.mvc.{Controller, AnyContent, Action}

object IgnoreParamAssets extends Controller {

  def at(path: String, file: String, ignoreParam: String): Action[AnyContent] = {
    Assets.at(path, file)
  }

}
