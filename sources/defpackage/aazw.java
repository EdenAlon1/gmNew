package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazw extends ffhv implements ffji {
    final /* synthetic */ abac a;
    final /* synthetic */ aoax b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazw(abac abacVar, aoax aoaxVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = abacVar;
        this.b = aoaxVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Intent intent;
        ffci.b(obj);
        bdtm bdtmVar = (bdtm) this.b;
        StringBuilder sb = new StringBuilder();
        String str = bdtmVar.a;
        abac abacVar = this.a;
        try {
        } catch (UnsupportedEncodingException unused) {
            ((enrr) abac.a.j().h("com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl", "getMapIntent", 1219, "SuggestionUiAdapterImpl.kt")).K("Unsupported encoding exception for suggested map action. query: %s, lat: %s, long: %s, label: %s", bdtmVar.a, bdtmVar.b, bdtmVar.c, bdtmVar.d);
        }
        if (TextUtils.isEmpty(str)) {
            String str2 = bdtmVar.b;
            String str3 = bdtmVar.c;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                String k = cuxt.k(str2);
                String k2 = cuxt.k(str3);
                String str4 = bdtmVar.d;
                if (TextUtils.isEmpty(str4)) {
                    String format = String.format("geo:%s,%s", Arrays.copyOf(new Object[]{k, k2}, 2));
                    format.getClass();
                    sb.append(format);
                } else {
                    String format2 = String.format("geo:0,0?q=%s,%s(%s)", Arrays.copyOf(new Object[]{k, k2, cuxt.k(str4)}, 3));
                    format2.getClass();
                    sb.append(format2);
                }
            }
            ((enrr) abac.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl", "getMapIntent", 1190, "SuggestionUiAdapterImpl.kt")).D("suggestion type map missing lat/lng, cannot create intent, lat: %s, long: %s", str2, str3);
            intent = null;
            return Boolean.valueOf(intent == null && ((crjp) this.a.v.b()).e(intent));
        }
        sb.append("geo:0,0?q=");
        sb.append(cuxt.k(str));
        intent = ((crjp) abacVar.v.b()).b(Uri.parse(sb.toString()));
        return Boolean.valueOf(intent == null && ((crjp) this.a.v.b()).e(intent));
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazw(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}
