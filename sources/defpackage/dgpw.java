package defpackage;

import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgpw extends dgxx {
    final /* synthetic */ dgpy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgpw(dgpy dgpyVar, Looper looper) {
        super(looper);
        this.a = dgpyVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message == null) {
            return;
        }
        if (!(message.obj instanceof Intent)) {
            Log.w("InstanceID", "Dropping invalid message");
            return;
        }
        dgpy dgpyVar = this.a;
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof MessengerCompat) {
                dgpyVar.i = (MessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                dgpyVar.h = (Messenger) parcelableExtra;
            }
        }
        dgpyVar.d((Intent) message.obj);
    }
}
