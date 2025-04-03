package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axzx b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axzu(ffgu ffguVar, axzx axzxVar) {
        super(2, ffguVar);
        this.b = axzxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axzu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            ekzz f = eleg.f("ContactsImport#schedule");
            try {
                ((ensz) axzx.a.h()).q("Scheduling contacts import");
                eyja d = eykm.d(this.b.d.f().toEpochMilli());
                axzx axzxVar = this.b;
                elfl b = axzxVar.g.b("ContactsImporter#schedule", new axzw(axzxVar, d));
                b.getClass();
                this.c = f;
                this.a = 1;
                Object c = fgfz.c(b, this);
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
        Void r8 = (Void) obj;
        ffig.a(closeable, null);
        return r8;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axzu axzuVar = new axzu(ffguVar, this.b);
        axzuVar.c = obj;
        return axzuVar;
    }
}
