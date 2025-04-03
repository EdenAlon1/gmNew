package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.emoji.widget.EmojiAppCompatTextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vim extends wr {
    public final cuxh s;
    public final ekmz t;
    public final Resources u;
    public final ImageView v;
    public final TextView w;
    public final TextView x;
    public final EmojiAppCompatTextView y;

    public vim(cuxh cuxhVar, ekmz ekmzVar, View view) {
        super(view);
        this.s = cuxhVar;
        this.t = ekmzVar;
        this.u = view.getResources();
        this.v = (ImageView) view.findViewById(R.id.participant_image);
        this.w = (TextView) view.findViewById(R.id.participant_name);
        this.x = (TextView) view.findViewById(R.id.participant_from_ios);
        this.y = (EmojiAppCompatTextView) view.findViewById(R.id.participant_reaction);
    }
}
