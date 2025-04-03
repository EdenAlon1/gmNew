package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxoc extends FrameLayout {
    public MessagePartCoreData a;
    public final cxmd b;
    final FrameLayout c;
    final ImageButton d;
    private final crik e;
    private final crih f;
    private final elbx g;

    public cxoc(Context context, cxmd cxmdVar, crik crikVar, crih crihVar, elbx elbxVar) {
        super(context);
        this.f = crihVar;
        this.g = elbxVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.attachment_preview_m2, (ViewGroup) this, true);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.close_button);
        this.d = imageButton;
        imageButton.setImageResource(R.drawable.remove_attachment_element_gm3);
        this.c = (FrameLayout) inflate.findViewById(R.id.attachment_view);
        this.b = cxmdVar;
        this.e = crikVar;
        setVisibility(4);
    }

    public final synchronized void a(MessagePartCoreData messagePartCoreData) {
        this.a = messagePartCoreData;
    }

    public final void b() {
        final MessagePartCoreData messagePartCoreData = this.a;
        messagePartCoreData.getClass();
        this.d.setOnClickListener(new elay(this.g, "SingleAttachmentPreview closeButton onClick", new View.OnClickListener() { // from class: cxob
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cylx cylxVar;
                cxoc cxocVar = cxoc.this;
                cxocVar.d.setOnClickListener(null);
                cxnk cxnkVar = (cxnk) cxocVar.b;
                alcb alcbVar = (alcb) cxnkVar.v.b();
                final MessagePartCoreData messagePartCoreData2 = messagePartCoreData;
                alcbVar.b(dcln.a(messagePartCoreData2), ((bcvr) ((cxtc) cxnkVar.a).c.x.a()).r(messagePartCoreData2));
                cxvv cxvvVar = ((cxtc) cxnkVar.a).c;
                if (((Boolean) uky.g.e()).booleanValue() && (cylxVar = cxvvVar.j) != null) {
                    cylxVar.T(new Consumer() { // from class: cxvm
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            cskc cskcVar = cxvv.a;
                            ((ugg) obj).k(MessagePartCoreData.this);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, null);
                }
                ((bcvr) cxvvVar.x.a()).x(messagePartCoreData2);
            }
        }));
        setVisibility(0);
        cric g = this.f.g(LayoutInflater.from(getContext()), messagePartCoreData, this.c, 3, this.b);
        if (g == null) {
            return;
        }
        View view = g.b;
        if (view != null) {
            AudioAttachmentView audioAttachmentView = (AudioAttachmentView) view.findViewById(R.id.audio_attachment_view);
            if (audioAttachmentView != null) {
                audioAttachmentView.b(this.e);
            }
            this.c.removeAllViews();
            this.c.addView(g.b);
        }
        crii criiVar = g.a;
        if (criiVar != null) {
            criiVar.g(messagePartCoreData, false, null, 3);
        }
    }
}
