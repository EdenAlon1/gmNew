package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.RcsWelcomeMessageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcyx {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/rcs/setup/RcsWelcomeMessageViewPeer");
    public dcyt b;
    public final TextView c;
    public final TextView d;
    public final RcsWelcomeMessageView e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;

    public dcyx(RcsWelcomeMessageView rcsWelcomeMessageView, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.e = rcsWelcomeMessageView;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        LayoutInflater.from(rcsWelcomeMessageView.getContext()).inflate(R.layout.rcs_welcome_message_view_m2, (ViewGroup) rcsWelcomeMessageView, true);
        this.c = (TextView) rcsWelcomeMessageView.findViewById(R.id.rcs_welcome_message_title);
        TextView textView = (TextView) rcsWelcomeMessageView.findViewById(R.id.rcs_welcome_message_message);
        this.d = textView;
        egyl.b(textView);
        egyl.c(textView);
    }
}
