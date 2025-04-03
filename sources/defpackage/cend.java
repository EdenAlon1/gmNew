package defpackage;

import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cend extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cenh b;
    final /* synthetic */ PrintWriter c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cend(ffgu ffguVar, cenh cenhVar, PrintWriter printWriter) {
        super(2, ffguVar);
        this.b = cenhVar;
        this.c = printWriter;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cend) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cenh cenhVar = this.b;
            this.a = 1;
            obj = cenhVar.a("BugleCmsBackupTimingDumper", this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        csjw csjwVar = (csjw) obj;
        try {
            csjwVar.a(this.c, csjz.DIAGNOSTICS);
            ffig.a(csjwVar, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cend cendVar = new cend(ffguVar, this.b, this.c);
        cendVar.d = obj;
        return cendVar;
    }
}
