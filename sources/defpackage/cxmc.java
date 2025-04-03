package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxmc extends crih {
    public cxmc(csmj csmjVar, cuxz cuxzVar, elbx elbxVar) {
        super(csmjVar, cuxzVar, elbxVar);
    }

    @Override // defpackage.crih
    protected final cric a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, PendingAttachmentData pendingAttachmentData) {
        int e = e(i, 6);
        int d = d(6);
        View inflate = layoutInflater.inflate(e, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(d);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        csix.k(i == 3);
        int dimensionPixelSize = layoutInflater.getContext().getResources().getDimensionPixelSize(R.dimen.compose_attachment_size);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        cuxz cuxzVar = this.c;
        if (cuxzVar != null) {
            Drawable a = cuxzVar.a(viewGroup.getResources());
            a.setVisible(true, true);
            imageView.setImageDrawable(a);
        }
        cric cricVar = new cric(null, inflate);
        TextView textView = (TextView) cricVar.b.findViewById(R.id.caption);
        if (textView != null) {
            String ae = pendingAttachmentData.ae();
            textView.setVisibility(true == TextUtils.isEmpty(ae) ? 8 : 0);
            textView.setText(ae);
        }
        return cricVar;
    }

    @Override // defpackage.crih
    protected final cric b(LayoutInflater layoutInflater, MessagePartCoreData messagePartCoreData, ViewGroup viewGroup, int i) {
        int e = e(i, 3);
        int d = d(3);
        View inflate = layoutInflater.inflate(e, viewGroup, false);
        cxow H = ((VideoAttachmentView) inflate.findViewById(d)).H();
        c(inflate, messagePartCoreData.t() != null);
        return new cric(H, inflate);
    }

    @Override // defpackage.crih
    protected final int d(int i) {
        switch (i - 1) {
            case 0:
                return R.id.image_attachment_view;
            case 1:
                return R.id.audio_attachment_view;
            case 2:
                return R.id.video_attachment_view;
            case 3:
                return R.id.vcard_attachment_view;
            case 4:
            default:
                csix.c("unsupported or unknown attachment view type!");
                return -1;
            case 5:
                return R.id.pending_item_view;
            case 6:
                return R.id.file_attachment_view;
            case 7:
                return R.id.cms_click_to_download_view;
            case 8:
                return R.id.missing_attachment_view;
            case 9:
                return R.id.cms_broken_media_view;
        }
    }

    @Override // defpackage.crih
    protected final int e(int i, int i2) {
        if (i2 == 9) {
            return R.layout.attachment_single_missing;
        }
        if (i2 == 1) {
            if (i == 1) {
                return R.layout.attachment_single_image;
            }
            if (i == 3) {
                return R.layout.attachment_compose_image;
            }
            csix.c("unsupported or unknown attachment view type!");
            return -1;
        }
        if (i2 == 4) {
            if (i == 1) {
                return R.layout.attachment_single_vcard_consistent;
            }
            if (i == 3) {
                return R.layout.attachment_compose_vcard_consistent;
            }
            csix.c("unsupported or unknown attachment view type!");
            return -1;
        }
        if (i2 == 2) {
            if (i == 1) {
                return R.layout.audio_attachment_normal;
            }
            if (i == 3) {
                return R.layout.audio_attachment_compact;
            }
            csix.c("unsupported or unknown attachment view type!");
            return -1;
        }
        if (i2 == 3) {
            if (i == 1) {
                return R.layout.attachment_single_video;
            }
            if (i == 3) {
                return R.layout.attachment_compose_video;
            }
            csix.c("unsupported or unknown attachment view type!");
            return -1;
        }
        if (i2 == 6) {
            return R.layout.attachment_pending_item;
        }
        if (i2 == 7) {
            return i != 3 ? R.layout.attachment_single_file : R.layout.attachment_compose_file;
        }
        if (i2 == 8) {
            return R.layout.attachment_click_to_download_media;
        }
        if (i2 == 10) {
            return R.layout.attachment_cms_broken_media;
        }
        csix.c("Unsupported attachment type");
        return -1;
    }

    @Override // defpackage.crih
    protected final cric f(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        int e = e(i, i2);
        int d = d(i2);
        View inflate = layoutInflater.inflate(e, viewGroup, false);
        crii criiVar = (crii) ekhs.a(inflate.findViewById(d));
        crih.c(inflate, true);
        return new cric(criiVar, inflate);
    }
}
