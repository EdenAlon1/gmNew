package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import j$.util.Objects;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfoo extends dgxx {
    final /* synthetic */ dfop a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfoo(dfop dfopVar, Looper looper) {
        super(looper);
        this.a = dfopVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("Rpc", "Dropping invalid message");
            return;
        }
        dfop dfopVar = this.a;
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new dfno());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof CloudMessagingMessengerCompat) {
                dfopVar.g = (CloudMessagingMessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                dfopVar.f = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        String action = intent2.getAction();
        if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
            if (Log.isLoggable("Rpc", 3)) {
                Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                return;
            }
            return;
        }
        String stringExtra = intent2.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            Matcher matcher = dfop.b.matcher(stringExtra);
            if (!matcher.matches()) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                    return;
                }
                return;
            }
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                Bundle extras = intent2.getExtras();
                extras.putString("registration_id", group2);
                dfopVar.c(group, extras);
                return;
            }
            return;
        }
        String stringExtra2 = intent2.getStringExtra("error");
        if (stringExtra2 == null) {
            Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(String.valueOf(intent2.getExtras()))));
            return;
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
        }
        if (!stringExtra2.startsWith("|")) {
            synchronized (dfopVar.c) {
                int i = 0;
                while (true) {
                    cpn cpnVar = dfopVar.c;
                    if (i < cpnVar.d) {
                        dfopVar.c((String) cpnVar.d(i), intent2.getExtras());
                        i++;
                    }
                }
            }
            return;
        }
        String[] split = stringExtra2.split("\\|");
        if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
            Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
            return;
        }
        String str = split[2];
        String str2 = split[3];
        if (str2.startsWith(":")) {
            str2 = str2.substring(1);
        }
        dfopVar.c(str, intent2.putExtra("error", str2).getExtras());
    }
}
