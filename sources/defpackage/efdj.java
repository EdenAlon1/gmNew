package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdj implements efbi {
    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        if (efbhVar.b()) {
            throw new efcy("Transforms are not supported by this Opener: ".concat(String.valueOf(String.valueOf(efbhVar.e))));
        }
        return new efdi(efbhVar.a, efbhVar.e);
    }
}
