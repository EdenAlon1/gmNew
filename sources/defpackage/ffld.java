package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffld {
    public static final String a(ffkf ffkfVar) {
        String obj = ffkfVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
