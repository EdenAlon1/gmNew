package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xqs implements ffix {
    final /* synthetic */ xra a;
    final /* synthetic */ boolean b;

    public xqs(xra xraVar, boolean z) {
        this.a = xraVar;
        this.b = z;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ensk e = xra.a.e();
        e.Y(ente.a, "BugleComposeRow2");
        enrr enrrVar = (enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/imagecompression/DirectSendImageCompressionUiAdapter", "showImageCompressionBottomSheet", 71, "DirectSendImageCompressionUiAdapter.kt");
        final boolean z = this.b;
        enrrVar.t("Showing image compression bottom sheet, fastImageSendingEnabled: %b", Boolean.valueOf(z));
        final xra xraVar = this.a;
        axol.k(xraVar.c, null, new xqz(xraVar, null), 3);
        xraVar.e.b(new ffji() { // from class: xqh
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                final ajiy ajiyVar = (ajiy) obj;
                ajiyVar.getClass();
                final xra xraVar2 = xra.this;
                Context context = xraVar2.b;
                String string = context.getString(R.string.direct_send_image_compression_bottom_sheet_title);
                String string2 = context.getString(R.string.direct_send_image_compression_bottom_sheet_subtitle);
                String string3 = context.getString(R.string.direct_send_image_compression_bottom_sheet_compressed_option_title);
                string3.getClass();
                String string4 = xraVar2.b.getString(R.string.direct_send_image_compression_bottom_sheet_compressed_option_text);
                string4.getClass();
                dmzz dmzzVar = dmzz.bz;
                String string5 = xraVar2.b.getString(R.string.direct_send_image_compression_bottom_sheet_original_option_title);
                string5.getClass();
                String string6 = xraVar2.b.getString(R.string.direct_send_image_compression_bottom_sheet_original_option_text);
                string6.getClass();
                return new abfu(ffdx.g(new abft(string3, string4, new ffix() { // from class: xqj
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        xra xraVar3 = xra.this;
                        axol.k(xraVar3.c, null, new xqw(xraVar3, null), 3);
                        ajiyVar.a();
                        return ffcu.a;
                    }
                }, dmzzVar), new abft(string5, string6, new ffix() { // from class: xqk
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        xra xraVar3 = xra.this;
                        axol.k(xraVar3.c, null, new xqy(xraVar3, null), 3);
                        ajiyVar.a();
                        return ffcu.a;
                    }
                }, dmzz.bA)), (z ? xrc.a : xrc.b).c, string, string2, new ffix() { // from class: xql
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        xra xraVar3 = xra.this;
                        axol.k(xraVar3.c, null, new xqu(xraVar3, null), 3);
                        return ffcu.a;
                    }
                });
            }
        });
        return ffcu.a;
    }
}
