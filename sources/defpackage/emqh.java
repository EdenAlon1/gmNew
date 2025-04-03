package defpackage;

import j$.time.LocalDateTime;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class emqh extends ffkh implements ffji {
    public static final emqh a = new emqh();

    public emqh() {
        super(1, ffki.class, "extractInferredMonth", "extractMonth$extractInferredMonth(Ljava/time/LocalDateTime;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        if (((LocalDateTime) obj) != null) {
            return Integer.valueOf(r1.getMonthValue() - 1);
        }
        return null;
    }
}
