package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axyt extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ axyy c;
    final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axyt(axyy axyyVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = axyyVar;
        this.d = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axyt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ?? r0;
        Uri uri;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                ffci.b(obj);
                r0 = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(r0, th);
                    throw th2;
                }
            }
        } else {
            ffci.b(obj);
            axyy axyyVar = this.c;
            List list = this.d;
            if (!ekxi.b(u())) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ekzz f = eleg.f("Cp2DataService#queryEnterpriseContactsExist");
            try {
                uri = ContactsContract.Contacts.ENTERPRISE_CONTENT_URI;
                uri.getClass();
                this.a = f;
                this.b = 1;
                obj = axyyVar.B(list, uri, true, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                r0 = f;
            } catch (Throwable th3) {
                th = th3;
                r0 = f;
                throw th;
            }
        }
        List list2 = (List) obj;
        ffig.a(r0, null);
        return list2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axyt(this.c, this.d, ffguVar);
    }
}
