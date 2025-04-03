package defpackage;

import android.net.Uri;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xss extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xhm b;
    final /* synthetic */ xsw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xss(ffgu ffguVar, xhm xhmVar, xsw xswVar) {
        super(2, ffguVar);
        this.b = xhmVar;
        this.c = xswVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xss) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ffhh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        ?? r0 = ffhh.a;
        int i = this.a;
        boolean z = true;
        try {
            if (i == 0) {
                ffci.b(obj);
                Object f = eleg.f("AttachmentSecurityFilter#isAllowed");
                try {
                    xhm xhmVar = this.b;
                    if (xhmVar instanceof xhk) {
                        xsw xswVar = this.c;
                        doyc doycVar = ((xhk) xhmVar).b;
                        this.d = f;
                        this.a = 1;
                        Object a = xswVar.a(doycVar, this);
                        if (a != r0) {
                            obj3 = f;
                            obj = a;
                            z = ((Boolean) obj).booleanValue();
                            r0 = obj3;
                        }
                    } else if (xhmVar instanceof xhl) {
                        xsw xswVar2 = this.c;
                        Uri uri = ((xhl) xhmVar).c;
                        this.d = f;
                        this.a = 2;
                        Object b = xswVar2.b(uri, this);
                        if (b != r0) {
                            obj2 = f;
                            obj = b;
                            z = ((Boolean) obj).booleanValue();
                            r0 = obj2;
                        }
                    } else {
                        if (!(xhmVar instanceof xhj)) {
                            throw new ffcd();
                        }
                        ensk f2 = xsw.a.f();
                        f2.Y(ente.a, "BugleComposeRow2");
                        ((enrr) f2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/AttachmentSecurityFilter$isAllowed$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 83, "AttachmentSecurityFilter.kt")).t("AttachmentSecurityFilter did not inspect URI for remote attachment %s", this.b);
                        r0 = f;
                    }
                    return r0;
                } catch (Throwable th) {
                    r0 = f;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ffig.a(r0, th);
                        throw th2;
                    }
                }
            }
            if (i != 1) {
                Object obj4 = (Closeable) this.d;
                ffci.b(obj);
                obj2 = obj4;
                z = ((Boolean) obj).booleanValue();
                r0 = obj2;
            } else {
                Object obj5 = (Closeable) this.d;
                ffci.b(obj);
                obj3 = obj5;
                z = ((Boolean) obj).booleanValue();
                r0 = obj3;
            }
            Boolean valueOf = Boolean.valueOf(z);
            ffig.a(r0, null);
            return valueOf;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xss xssVar = new xss(ffguVar, this.b, this.c);
        xssVar.d = obj;
        return xssVar;
    }
}
