package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eljo {
    public static final DateFormat a = new SimpleDateFormat("MM-dd HH:mm:ss");
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final elbx e;

    /* compiled from: PG */
    public abstract class a implements ellf {
        public abstract eljy a();
    }

    public eljo(View view, elbx elbxVar) {
        this.e = elbxVar;
        this.b = (TextView) view.findViewById(R.id.time);
        this.c = (TextView) view.findViewById(R.id.name);
        this.d = (TextView) view.findViewById(R.id.duration);
    }
}
