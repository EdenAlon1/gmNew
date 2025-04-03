package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyi extends dpnn {
    public static final /* synthetic */ int u = 0;
    private final dqkk v;
    private final dpnj w;
    private final View x;
    private final View y;

    public dpyi(dqkk dqkkVar, View view, dpnj dpnjVar) {
        super(view);
        this.v = dqkkVar;
        this.w = dpnjVar;
        this.x = view.findViewById(R.id.system_camera_photo_button);
        this.y = view.findViewById(R.id.system_camera_video_button);
    }

    @Override // defpackage.dpnn
    public final Object C(ffgu ffguVar) {
        final dpnk dpnkVar = this.w.c;
        this.x.setOnClickListener(this.v.b("SystemCameraPickerViewHolder.photoButton#onClick", new View.OnClickListener() { // from class: dpyg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = dpyi.u;
                view.getClass();
                dpnk.this.a(view);
            }
        }));
        this.y.setOnClickListener(this.v.b("SystemCameraPickerViewHolder.videoButton#onClick", new View.OnClickListener() { // from class: dpyh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = dpyi.u;
                view.getClass();
                dpnk.this.a(view);
            }
        }));
        return ffcu.a;
    }

    @Override // defpackage.dpnn
    public final Object E() {
        return ffcu.a;
    }

    @Override // defpackage.dpnn
    public final void D(dpni dpniVar) {
    }
}
