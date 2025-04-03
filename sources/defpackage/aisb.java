package defpackage;

import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aisb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aisg b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisb(ffgu ffguVar, aisg aisgVar) {
        super(2, ffguVar);
        this.b = aisgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        Throwable th;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            closeable = (Closeable) this.c;
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
            ekzz f = eleg.f("Cp2BirthdayQueries#getContactsBirthdayCoverage");
            try {
                if (!((ctud) this.b.c.b()).i()) {
                    ((ensz) aisg.a.f()).q("No permission for reading birthdays from contacts");
                    ffig.a(f, null);
                    return null;
                }
                ((ensz) aisg.a.f()).q("Calculating birthday coverage of contacts");
                axwk axwkVar = this.b.d;
                this.c = f;
                this.a = 1;
                Object b = axwkVar.b(this);
                if (b == ffhhVar) {
                    return ffhhVar;
                }
                closeable = f;
                obj = b;
            } catch (Throwable th4) {
                closeable = f;
                th = th4;
                throw th;
            }
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            ffig.a(closeable, null);
            return null;
        }
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((axwi) it.next()).r != null && (i = i + 1) < 0) {
                    ffdx.k();
                }
            }
        }
        Integer num = new Integer((i * 1000) / list.size());
        ffig.a(closeable, null);
        return num;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aisb aisbVar = new aisb(ffguVar, this.b);
        aisbVar.c = obj;
        return aisbVar;
    }
}
