package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dvjq implements emwl {
    public abstract void a(exwt exwtVar, evwg evwgVar);

    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        exwt exwtVar = (exwt) obj;
        evwg evwgVar = (evwg) evwh.a.createBuilder();
        if ((exwtVar.b & 1) != 0) {
            String str = exwtVar.c;
            evwgVar.copyOnWrite();
            evwh evwhVar = (evwh) evwgVar.instance;
            str.getClass();
            evwhVar.b |= 1;
            evwhVar.e = str;
        }
        a(exwtVar, evwgVar);
        return (evwh) evwgVar.build();
    }
}
