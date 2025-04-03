package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffhc extends ffkk implements ffjm {
    public static final ffhc a = new ffhc();

    public ffhc() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ffhd ffhdVar = (ffhd) obj;
        ffha ffhaVar = (ffha) obj2;
        ffhdVar.getClass();
        ffhaVar.getClass();
        ffhd minusKey = ffhdVar.minusKey(ffhaVar.getKey());
        if (minusKey == ffhe.a) {
            return ffhaVar;
        }
        ffgw ffgwVar = (ffgw) minusKey.get(ffgw.k);
        if (ffgwVar == null) {
            return new ffgt(minusKey, ffhaVar);
        }
        ffhd minusKey2 = minusKey.minusKey(ffgw.k);
        return minusKey2 == ffhe.a ? new ffgt(ffhaVar, ffgwVar) : new ffgt(new ffgt(minusKey2, ffhaVar), ffgwVar);
    }
}
