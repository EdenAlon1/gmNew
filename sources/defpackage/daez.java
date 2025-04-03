package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daez extends davz {
    public static final enru ag = enru.c("com/google/android/apps/messaging/ui/debug/DebugSmsMmsFromDumpFileDialogFragment");
    public String ah;
    public cnkx ai;
    public dafa aj;
    public covp ak;
    public ffbr al;
    public bapk am;
    private String[] an;

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        Bundle bundle2 = this.m;
        Object serializable = bundle2.getSerializable("dump_files");
        this.an = serializable != null ? (String[]) serializable : new String[0];
        this.ah = bundle2.getString(GroupManagementRequest.ACTION_TAG);
        View inflate = G().getLayoutInflater().inflate(R.layout.debug_sms_mms_from_dump_file_dialog, (ViewGroup) null);
        ((ListView) inflate.findViewById(R.id.dump_file_list)).setAdapter((ListAdapter) new daey(this, G(), this.an));
        AlertDialog.Builder builder = new AlertDialog.Builder(G());
        Resources B = B();
        if ("load".equals(this.ah)) {
            builder.setTitle(B.getString(R.string.load_sms_mms_from_dump_file_dialog_title));
        } else if ("email".equals(this.ah)) {
            builder.setTitle(B.getString(R.string.email_sms_mms_from_dump_file_dialog_title));
        }
        builder.setView(inflate);
        return builder.create();
    }
}
