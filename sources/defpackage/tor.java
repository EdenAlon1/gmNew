package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.media.CmsMediaAttachmentView;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tor implements crii {
    private final CmsMediaAttachmentView a;
    private final ProgressBar b;

    public tor(CmsMediaAttachmentView cmsMediaAttachmentView, cxqh cxqhVar) {
        View.inflate(cmsMediaAttachmentView.getContext(), R.layout.cms_click_to_download_view, cmsMediaAttachmentView);
        this.a = cmsMediaAttachmentView;
        this.b = (ProgressBar) cmsMediaAttachmentView.findViewById(R.id.progress);
        ViewGroup viewGroup = (ViewGroup) cmsMediaAttachmentView.findViewById(R.id.icon_container);
        viewGroup.setBackground(cxqhVar.n());
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tor.this.a();
            }
        });
    }

    public final void a() {
        this.b.setVisibility(0);
    }

    @Override // defpackage.crii
    public final void c() {
        this.a.setTag(R.id.cms_attachment_icon_tag, null);
        this.b.setVisibility(4);
    }

    @Override // defpackage.crii
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, String str, int i) {
        Uri t = messagePartCoreData.t();
        if (t != null) {
            this.a.setTag(R.id.cms_attachment_icon_tag, t.toString());
        }
        if (messagePartCoreData.G() == byyu.CMS_MEDIA_DOWNLOADING) {
            a();
        }
    }

    @Override // defpackage.crid
    public final void d(boolean z, bcse bcseVar, Drawable drawable, float[] fArr) {
    }
}
