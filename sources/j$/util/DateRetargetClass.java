package j$.util;

import j$.time.Instant;
import java.util.Date;

/* loaded from: classes9.dex */
public final /* synthetic */ class DateRetargetClass {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Instant toInstant(Date date) {
        return date instanceof DateRetargetInterface ? ((DateRetargetInterface) date).toInstant() : DesugarDate.toInstant(date);
    }
}
