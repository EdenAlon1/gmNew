package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import j$.time.Instant;
import java.io.Closeable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axym extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Instant b;
    final /* synthetic */ axyy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axym(ffgu ffguVar, Instant instant, axyy axyyVar) {
        super(2, ffguVar);
        this.b = instant;
        this.c = axyyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axym) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        ?? r1 = this.a;
        try {
            if (r1 != 0) {
                Closeable closeable = (Closeable) this.d;
                ffci.b(obj);
                r1 = closeable;
            } else {
                ffci.b(obj);
                ekzz f = eleg.f("Cp2DataService#queryDeletedContacts");
                ekrc ekrcVar = new ekrc();
                ekrcVar.b("contact_deleted_timestamp > ?");
                ekrcVar.c(String.valueOf(this.b.toEpochMilli()));
                ekrb a = ekrcVar.a();
                axyy axyyVar = this.c;
                Uri uri = ContactsContract.DeletedContacts.CONTENT_URI;
                uri.getClass();
                axyn axynVar = axyn.a;
                this.d = f;
                this.a = 1;
                obj = axyyVar.C(uri, new String[]{"contact_id"}, a, axynVar, this);
                r1 = f;
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            List list = (List) obj;
            ffig.a(r1, null);
            return list;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axym axymVar = new axym(ffguVar, this.b, this.c);
        axymVar.d = obj;
        return axymVar;
    }
}
