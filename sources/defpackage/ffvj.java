package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffvj extends CancellationException implements ffrw {
    public final transient ffud a;

    public ffvj(String str, ffud ffudVar) {
        super(str);
        this.a = ffudVar;
    }

    @Override // defpackage.ffrw
    public final /* bridge */ /* synthetic */ Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        ffvj ffvjVar = new ffvj(message, this.a);
        ffvjVar.initCause(this);
        return ffvjVar;
    }
}
