package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avki {
    public static String a(awui awuiVar) {
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        emxf.b(!b.equals(awuh.GROUP), "Unexpected remote chat endpoint of type group");
        return UUID.nameUUIDFromBytes(awuiVar.d.getBytes(StandardCharsets.UTF_8)).toString();
    }
}
