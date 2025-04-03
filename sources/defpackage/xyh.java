package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyh extends RuntimeException implements ffrw {
    public xyh(String str, Throwable th) {
        super(str, th);
    }

    @Override // defpackage.ffrw
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        message.getClass();
        return new xyh(message, getCause());
    }
}
