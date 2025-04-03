package defpackage;

import j$.time.LocalDateTime;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class emqk extends ffkh implements ffji {
    public static final emqk a = new emqk();

    public emqk() {
        super(1, ffki.class, "extractInferredYear", "extractYear$extractInferredYear(Ljava/time/LocalDateTime;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (localDateTime != null) {
            return Integer.valueOf(localDateTime.getYear());
        }
        return null;
    }
}
