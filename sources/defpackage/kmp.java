package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmp {
    static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Notification.CallStyle forIncomingCall;
        forIncomingCall = Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
        return forIncomingCall;
    }

    static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
        Notification.CallStyle forOngoingCall;
        forOngoingCall = Notification.CallStyle.forOngoingCall(person, pendingIntent);
        return forOngoingCall;
    }

    static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Notification.CallStyle forScreeningCall;
        forScreeningCall = Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
        return forScreeningCall;
    }

    static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
        Notification.CallStyle answerButtonColorHint;
        answerButtonColorHint = callStyle.setAnswerButtonColorHint(i);
        return answerButtonColorHint;
    }

    static Notification.CallStyle e(Notification.CallStyle callStyle, int i) {
        Notification.CallStyle declineButtonColorHint;
        declineButtonColorHint = callStyle.setDeclineButtonColorHint(i);
        return declineButtonColorHint;
    }

    static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z) {
        Notification.CallStyle isVideo;
        isVideo = callStyle.setIsVideo(z);
        return isVideo;
    }

    static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
        Notification.CallStyle verificationIcon;
        verificationIcon = callStyle.setVerificationIcon(icon);
        return verificationIcon;
    }

    static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
        Notification.CallStyle verificationText;
        verificationText = callStyle.setVerificationText(charSequence);
        return verificationText;
    }
}
