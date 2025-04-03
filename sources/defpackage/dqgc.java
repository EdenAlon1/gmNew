package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgc extends wr {
    public static final /* synthetic */ int u = 0;
    public final MaterialButton s;
    final /* synthetic */ dqgd t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqgc(dqgd dqgdVar, View view) {
        super(view);
        this.t = dqgdVar;
        View findViewById = view.findViewById(R.id.gallery_folders_tile_button);
        findViewById.getClass();
        this.s = (MaterialButton) findViewById;
    }
}
