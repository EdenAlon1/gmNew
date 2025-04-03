package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnz extends ffkk implements ffji {
    public static final jnz a = new jnz();

    public jnz() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        return new jys(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
