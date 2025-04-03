package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yxx extends ffhv implements ffjm {
    final /* synthetic */ engw a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxx(ffgu ffguVar, engw engwVar) {
        super(2, ffguVar);
        this.a = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yxx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        for (Object obj2 : this.a) {
            if (((aqux) obj2).t()) {
                return obj2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yxx yxxVar = new yxx(ffguVar, this.a);
        yxxVar.b = obj;
        return yxxVar;
    }
}
