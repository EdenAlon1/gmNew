package defpackage;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
class jve extends jvd {
    public jve(InputConnection inputConnection, ffji ffjiVar) {
        super(inputConnection, ffjiVar);
    }

    @Override // defpackage.jvd
    protected final void a(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // defpackage.jvd, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean deleteSurroundingTextInCodePoints;
        InputConnection inputConnection = this.a;
        if (inputConnection == null) {
            return false;
        }
        deleteSurroundingTextInCodePoints = inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        return deleteSurroundingTextInCodePoints;
    }

    @Override // defpackage.jvd, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}
