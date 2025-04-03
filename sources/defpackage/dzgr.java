package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.util.Linkify;
import com.android.vcard.VCardConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgr implements dzgm {
    public final Context a;
    public final errl b = dyia.b().a;
    public final dzgu c;
    private final dyqz d;

    public dzgr(Context context, dyqz dyqzVar, dzgu dzguVar) {
        this.a = context;
        this.d = dyqzVar;
        this.c = dzguVar;
    }

    public static List a(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            Linkify.addLinks(valueOf, 1);
            for (ClickableSpan clickableSpan : (ClickableSpan[]) valueOf.getSpans(0, valueOf.length(), ClickableSpan.class)) {
                try {
                    arrayList.add(valueOf.subSequence(valueOf.getSpanStart(clickableSpan), valueOf.getSpanEnd(clickableSpan)).toString());
                } catch (IndexOutOfBoundsException e) {
                    dyhr.c("LighterLinkPreviewController", "TextUtil: Failed to extract url: ".concat(e.toString()));
                }
            }
        }
        return arrayList;
    }

    final void b(dzja dzjaVar, dzhb dzhbVar, dzqs dzqsVar) {
        byte[] bArr;
        dzno dznoVar = new dzno();
        dznoVar.a = "link_preview";
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("MESSAGE_TEXT", dzhbVar.g());
            hashMap.put(VCardConstants.PROPERTY_TITLE, dzhbVar.h());
            hashMap.put("DESCRIPTION", dzhbVar.d());
            hashMap.put("IMAGE_URL", dzhbVar.f());
            if (dzhbVar.b().g()) {
                hashMap.put("IMAGE", dyhu.j((Bitmap) dzhbVar.b().c()));
            }
            hashMap.put("DOMAIN", dzhbVar.e());
            hashMap.put("CANONICAL_URL", dzhbVar.c());
            if (dzhbVar.a().g()) {
                hashMap.put("EXPIRATION_TIME_MS", dzhbVar.a().c());
            }
            bArr = dyhu.i(hashMap);
        } catch (IOException e) {
            dyhr.d("LinkPreviewUtils", "Failed to serialize Link Preview", e);
            bArr = new byte[0];
        }
        dznoVar.b(bArr);
        dzqg g = dzqsVar.g();
        g.o(dzhbVar.g());
        g.f(dzhbVar.g());
        g.s(dznoVar.a());
        this.d.b(dzjaVar).aa(engw.r(g.a()));
    }
}
