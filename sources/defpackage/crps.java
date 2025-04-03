package defpackage;

import j$.time.LocalDate;
import j$.time.ZoneId;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crps {
    private final crjx a;

    public crps(crjx crjxVar) {
        crjxVar.getClass();
        this.a = crjxVar;
    }

    public static final String a(boolean z) {
        LocalDate now = LocalDate.now(ZoneId.systemDefault());
        Objects.toString(now);
        return String.valueOf(now).concat(true != z ? "" : "-night");
    }
}
