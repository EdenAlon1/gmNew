package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class emqg extends ffkh implements ffji {
    public static final emqg a = new emqg();

    public emqg() {
        super(1, ffki.class, "extractMonthFromDatetime", "extractMonth$extractMonthFromDatetime(Lgoogle/internal/communications/instantmessaging/v1/SuggestProto$DatetimeAnnotation;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fbtf fbtfVar = (fbtf) obj;
        fbtfVar.getClass();
        fbta fbtaVar = fbtfVar.e;
        if (fbtaVar == null) {
            fbtaVar = fbta.a;
        }
        return Integer.valueOf(fbtaVar.b);
    }
}
