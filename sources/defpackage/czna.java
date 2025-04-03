package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.transferview.TransferView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czna {
    public final TransferView a;
    public final ffbr b;
    public final ImageView c;
    public final ProgressBar d;

    public czna(TransferView transferView, ffbr ffbrVar) {
        this.a = transferView;
        this.b = ffbrVar;
        LayoutInflater.from(transferView.getContext()).inflate(R.layout.transfer_view, (ViewGroup) transferView, true);
        this.c = (ImageView) transferView.findViewById(R.id.icon);
        this.d = (ProgressBar) transferView.findViewById(R.id.progress);
    }
}
