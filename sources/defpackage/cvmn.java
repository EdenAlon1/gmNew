package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvmn extends cvmi {
    public coxb ag;

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(G());
        View inflate = G().getLayoutInflater().inflate(R.layout.sms_storage_low_warning_dialog, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(R.id.free_storage_action_list);
        Resources resources = G().getResources();
        String b = this.ag.b(z(), this.ag.a());
        ArrayList arrayList = new ArrayList();
        arrayList.add(resources.getString(R.string.delete_all_media));
        arrayList.add(resources.getString(R.string.delete_oldest_messages, b));
        listView.setAdapter((ListAdapter) new cvmm(this, G(), arrayList));
        builder.setTitle(R.string.low_storage_space_notification_and_dialog_title).setView(inflate).setNegativeButton(R.string.ignore, new DialogInterface.OnClickListener() { // from class: cvmk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog create = builder.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        G().finish();
    }
}
