package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class drbx extends ffkh implements ffji {
    public drbx(Object obj) {
        super(1, obj, drcf.class, "onStickerLongClicked", "onStickerLongClicked(Lcom/google/android/libraries/compose/emotify/data/CustomSticker;)Z", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        final dqzc dqzcVar = (dqzc) obj;
        dqzcVar.getClass();
        final drcf drcfVar = (drcf) this.g;
        ((enrr) drcf.a.e().h("com/google/android/libraries/compose/emotify/ui/screen/EmotifyScreen", "onStickerLongClicked", 204, "EmotifyScreen.kt")).t("Custom sticker %s long clicked", dqzcVar.a);
        ehft ehftVar = new ehft(drcfVar.A());
        ehftVar.x(R.string.delete_sticker_dialog_title);
        ehftVar.m(R.string.delete_sticker_dialog_body);
        ehftVar.t(R.string.delete_sticker_dialog_positive, new DialogInterface.OnClickListener() { // from class: drbj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                drcf drcfVar2 = drcf.this;
                ffqy.d(drcfVar2.p(), null, null, new drbt(dqzcVar, drcfVar2, null), 3);
            }
        });
        ehftVar.o(R.string.delete_sticker_dialog_negative, new DialogInterface.OnClickListener() { // from class: drbk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                enru enruVar = drcf.a;
                dialogInterface.dismiss();
            }
        });
        ehftVar.a();
        return true;
    }
}
