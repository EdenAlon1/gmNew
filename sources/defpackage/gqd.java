package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gqd extends ffkk implements ffjm {
    final /* synthetic */ ffjn a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqd(ffjn ffjnVar, List list) {
        super(2);
        this.a = ffjnVar;
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.a(this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
