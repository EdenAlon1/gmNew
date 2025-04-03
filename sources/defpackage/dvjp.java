package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvjp implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eybv eybvVar = (eybv) obj;
        evwe evweVar = (evwe) evwf.a.createBuilder();
        if ((eybvVar.b & 1) != 0) {
            emwl emwlVar = dvlg.a;
            eybs b = eybs.b(eybvVar.c);
            if (b == null) {
                b = eybs.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
            }
            Object apply = emwlVar.apply(b);
            evweVar.copyOnWrite();
            evwf evwfVar = (evwf) evweVar.instance;
            evwfVar.c = ((evsn) apply).a();
            evwfVar.b |= 1;
        }
        return (evwf) evweVar.build();
    }
}
