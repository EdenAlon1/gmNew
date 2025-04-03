package defpackage;

import android.content.ActivityNotFoundException;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avil extends ffhv implements ffjm {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ avin c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avil(ffgu ffguVar, String str, avin avinVar, String str2) {
        super(2, ffguVar);
        this.b = str;
        this.c = avinVar;
        this.d = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avil) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String str;
        boolean j;
        ffhh ffhhVar = ffhh.a;
        boolean z = true;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                if (!TextUtils.isEmpty(this.b)) {
                    String str2 = this.b;
                    if (str2 != null) {
                        str = str2.toUpperCase(Locale.ROOT);
                        str.getClass();
                    } else {
                        str = null;
                    }
                    j = ffpc.j(str, "FULL", false);
                    if (!j) {
                        avin avinVar = this.c;
                        String str3 = this.d;
                        String str4 = this.b;
                        this.a = 1;
                        if (avinVar.c(str3, str4, this) == ffhhVar) {
                            return ffhhVar;
                        }
                    }
                }
                avin avinVar2 = this.c;
                String str5 = this.d;
                ((aigz) avinVar2.b.b()).h(new aimq(avinVar2.b("FULL"), str5));
            }
        } catch (ActivityNotFoundException unused) {
            ((enrr) avin.a.j().h("com/google/android/apps/messaging/shared/business/RbmWebviewHelperImpl$launchCustomTabsIntent$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 54, "RbmWebviewHelperImpl.kt")).q("Could not launch custom tabs for webview suggestion.");
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avil avilVar = new avil(ffguVar, this.b, this.c, this.d);
        avilVar.e = obj;
        return avilVar;
    }
}
