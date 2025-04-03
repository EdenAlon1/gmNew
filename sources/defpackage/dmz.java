package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmz extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ float d;
    final /* synthetic */ dna e;
    final /* synthetic */ drd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmz(float f, dna dnaVar, drd drdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = f;
        this.e = dnaVar;
        this.f = drdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ffky, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        float f;
        ffky ffkyVar;
        Object obj2;
        Object g;
        ffky ffkyVar2;
        ffhh ffhhVar = ffhh.a;
        if (this.c != 0) {
            obj2 = this.b;
            ffkyVar = this.a;
            try {
                ffci.b(obj);
                ffkyVar2 = ffkyVar;
            } catch (CancellationException unused) {
                ffkyVar.a = ((Number) ((cxv) obj2).b()).floatValue();
                ffkyVar2 = ffkyVar;
                f = ffkyVar2.a;
                return new Float(f);
            }
        } else {
            ffci.b(obj);
            if (Math.abs(this.d) <= 1.0f) {
                f = this.d;
                return new Float(f);
            }
            ffkyVar = new ffky();
            ffkyVar.a = this.d;
            ffky ffkyVar3 = new ffky();
            cxv b = cxw.b(0.0f, this.d, 28);
            try {
                dna dnaVar = this.e;
                cyj cyjVar = dnaVar.b;
                dmy dmyVar = new dmy(ffkyVar3, this.f, ffkyVar, dnaVar);
                this.a = ffkyVar;
                this.b = b;
                this.c = 1;
                g = dap.g(b, cyjVar, false, dmyVar, this);
                ffkyVar2 = ffkyVar;
                if (g == ffhhVar) {
                    return ffhhVar;
                }
            } catch (CancellationException unused2) {
                obj2 = b;
                ffkyVar.a = ((Number) ((cxv) obj2).b()).floatValue();
                ffkyVar2 = ffkyVar;
                f = ffkyVar2.a;
                return new Float(f);
            }
        }
        f = ffkyVar2.a;
        return new Float(f);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmz(this.d, this.e, this.f, ffguVar);
    }
}
