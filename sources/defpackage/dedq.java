package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedq {
    public static void a(Context context, final Runnable runnable) {
        ehft ehftVar = new ehft(context);
        ehftVar.x(R.string.title_of_video_attachment_needs_trimming);
        ehftVar.m(R.string.text_of_video_attachment_needs_trimming);
        ehftVar.t(R.string.open_video_trimmer_dialog_positive, new DialogInterface.OnClickListener() { // from class: dedo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnable.run();
            }
        });
        ehftVar.o(R.string.open_video_trimmer_dialog_negative, new DialogInterface.OnClickListener() { // from class: dedp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        ehftVar.create().show();
    }
}
