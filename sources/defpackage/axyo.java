package defpackage;

import android.provider.ContactsContract;
import j$.time.Instant;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Instant b;
    final /* synthetic */ axyy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axyo(ffgu ffguVar, Instant instant, axyy axyyVar) {
        super(2, ffguVar);
        this.b = instant;
        this.c = axyyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axyo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        Throwable th;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
            try {
                ffci.b(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ffig.a(closeable, th);
                    throw th3;
                }
            }
        } else {
            ffci.b(obj);
            ekzz f = eleg.f("Cp2DataService#queryDeletedContactsCount");
            try {
                ekrc ekrcVar = new ekrc();
                ekrcVar.b("contact_deleted_timestamp > ?");
                ekrcVar.c(String.valueOf(this.b.toEpochMilli()));
                erph a = this.c.e.a(ContactsContract.DeletedContacts.CONTENT_URI, new String[]{"contact_id"}, ekrcVar.a(), null);
                final axyq axyqVar = axyq.a;
                erqc g = a.e(new erow() { // from class: axyx
                    @Override // defpackage.erow
                    public final /* synthetic */ Object a(erpc erpcVar, Object obj2) {
                        return ffjm.this.a(erpcVar, obj2);
                    }
                }, this.c.d).g();
                g.getClass();
                this.d = f;
                this.a = 1;
                Object c = fgfz.c(g, this);
                if (c == ffhhVar) {
                    return ffhhVar;
                }
                closeable = f;
                obj = c;
            } catch (Throwable th4) {
                closeable = f;
                th = th4;
                throw th;
            }
        }
        Integer num = (Integer) obj;
        ffig.a(closeable, null);
        return num;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axyo axyoVar = new axyo(ffguVar, this.b, this.c);
        axyoVar.d = obj;
        return axyoVar;
    }
}
