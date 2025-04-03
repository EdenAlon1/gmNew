package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanv {
    private static final List a = ffdx.g("https://youtube.com/*", "https://www.youtube.com/*", "https://fonts.gstatic.com/*", "https://googleads.g.doubleclick.net/*", "https://static.doubleclick.net/*", "https://jnn-pa.googleapis.com/*", "https://www.google.com/*", "https://i.ytimg.com/*", "https://*.ggpht.com/*", "https://redirector.googlevideo.com/*", "https://play.google.com/*", "https://*.googlevideo.com/*");

    public static final void a(final aanx aanxVar, hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        aanxVar.getClass();
        hfd b = hfdVar.b(1909075848);
        if ((i & 6) == 0) {
            i2 = (true != b.D(aanxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && b.I()) {
            b.s();
            hviVar2 = hviVar;
        } else {
            String str = aanxVar.a;
            hviVar2 = hvi.e;
            String b2 = ffpc.b("\n      <!DOCTYPE html>\n      <html>\n          <head>\n              <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n                  <style>\n                      body { margin: 0; width:100%; height:100%; background-color:#000; }\n                      html { width:100%; height:100%; background-color:#000; }\n\n                      #ytplayer {\n                          position: absolute;\n                          top: 0;\n                          left: 0;\n                          width: 100% !important;\n                          height: 100% !important;\n                          border: 0px;\n                      }\n                  </style>\n          </head>\n          <body>\n              <!-- https://developers.google.com/youtube/player_parameters#Manual_IFrame_Embeds -->\n              <!-- Iframe width and height values does not play role for this html piece -->\n              <iframe id=\"ytplayer\" type=\"text/html\" width=\"16\" height=\"9\"\n                src=\"https://www.youtube.com/embed/" + str + "?modestbranding=1&rel=0&enablejsapi=1&autoplay=1&mute=1\"\n                sandbox=\"allow-scripts allow-same-origin\" frameborder=\"0\" allowfullscreen></iframe>\n                \n              <!-- https://developers.google.com/youtube/iframe_api_reference#Example_Video_Player_Constructors -->\n              <script type=\"text/javascript\">\n                  var tag = document.createElement('script');\n                  tag.src = \"https://www.youtube.com/iframe_api\";\n                  var firstScriptTag = document.getElementsByTagName('script')[0];\n                  firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);\n\n                  var player;\n                  function onYouTubeIframeAPIReady() {\n                      player = new YT.Player('ytplayer', {});\n                  }\n              </script>\n          </body>\n      </html>\n    ");
            b.v(1310690006);
            b.v(-1738729793);
            boolean D = b.D(b2) | b.D(null);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new doxf(new dowk(b2));
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hfmVar.Z();
            dowz.b((doxf) R, a, ebs.e(hviVar2, 200.0f), false, null, null, null, null, null, null, b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: aanu
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    aanx aanxVar2 = aanx.this;
                    int a2 = hip.a(i3 | 1);
                    aanv.a(aanxVar2, hviVar2, (hfd) obj, a2);
                    return ffcu.a;
                }
            };
        }
    }
}
