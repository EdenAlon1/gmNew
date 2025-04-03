package defpackage;

import j$.time.LocalDateTime;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class emqe extends ffkh implements ffji {
    public static final emqe a = new emqe();

    public emqe() {
        super(1, ffki.class, "extractInferredDay", "extractDay$extractInferredDay(Ljava/time/LocalDateTime;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (localDateTime != null) {
            return Integer.valueOf(localDateTime.getDayOfMonth());
        }
        return null;
    }
}
