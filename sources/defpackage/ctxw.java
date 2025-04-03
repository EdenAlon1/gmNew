package defpackage;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctxw {
    public static final cskc a = cskc.g("Bugle", "PlaceWebServiceApiImpl");
    private final errl b;
    private final ctyp c;

    public ctxw(errl errlVar, ctyp ctypVar) {
        this.b = errlVar;
        this.c = ctypVar;
    }

    public final elfl a(LatLng latLng) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority("maps.googleapis.com").appendPath("maps").appendPath("api").appendPath("geocode").appendPath("json").appendQueryParameter("latlng", latLng.a + "," + latLng.b).appendQueryParameter("key", "AIzaSyCVl7z2EZZ1S1mbhW_beZ1cELoLreBMECM");
        return elfl.g(this.c.a(builder.build().toString())).h(new emwl() { // from class: ctxv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                try {
                    JSONArray optJSONArray = new JSONObject((String) obj).optJSONArray("results");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(0);
                        int i = engw.d;
                        engr engrVar = new engr();
                        JSONArray jSONArray = jSONObject.getJSONArray("types");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            engrVar.h(jSONArray.getString(i2));
                        }
                        edpv av = edqc.av();
                        ((edlt) av).n = jSONObject.getString("place_id");
                        ((edlt) av).B = engrVar.g();
                        ((edlt) av).b = jSONObject.optString("formatted_address");
                        ((edlt) av).r = jSONObject.optString("name");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("geometry").getJSONObject("location");
                        ((edlt) av).p = new LatLng(jSONObject2.getDouble(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT), jSONObject2.getDouble("lng"));
                        return Optional.of(av.F());
                    }
                } catch (JSONException e) {
                    ctxw.a.o("Failed to parse place from response", e);
                }
                return Optional.empty();
            }
        }, this.b);
    }
}
