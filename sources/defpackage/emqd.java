package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class emqd extends ffkh implements ffji {
    public static final emqd a = new emqd();

    public emqd() {
        super(1, ffki.class, "extractDayFromDatetime", "extractDay$extractDayFromDatetime(Lgoogle/internal/communications/instantmessaging/v1/SuggestProto$DatetimeAnnotation;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fbtf fbtfVar = (fbtf) obj;
        fbtfVar.getClass();
        fbst fbstVar = fbtfVar.f;
        if (fbstVar == null) {
            fbstVar = fbst.a;
        }
        return Integer.valueOf(fbstVar.b);
    }
}
