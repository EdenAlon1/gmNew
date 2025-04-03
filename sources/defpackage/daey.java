package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.telephony.SmsMessage;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daey extends ArrayAdapter {
    final /* synthetic */ daez a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daey(daez daezVar, Context context, String[] strArr) {
        super(context, R.layout.sms_mms_dump_file_list_item, strArr);
        this.a = daezVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (view == null || !(view instanceof TextView)) ? (TextView) LayoutInflater.from(getContext()).inflate(R.layout.sms_mms_dump_file_list_item, viewGroup, false) : (TextView) view;
        final String str = (String) getItem(i);
        textView.setText(str);
        textView.setOnClickListener(new View.OnClickListener() { // from class: daex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte[] bArr;
                daey daeyVar = daey.this;
                daeyVar.a.hw();
                String str2 = str;
                if (str2 != null) {
                    if (!"load".equals(daeyVar.a.ah)) {
                        if ("email".equals(daeyVar.a.ah)) {
                            daez daezVar = daeyVar.a;
                            Resources B = daezVar.B();
                            Context z = daezVar.z();
                            if (z == null) {
                                throw new IllegalStateException("Context cannot be null.");
                            }
                            File a = ((csrv) daezVar.al.b()).a(str2, false, z);
                            File e = cflz.e(z, a.getName());
                            try {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(a));
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
                                eiru.a(bufferedInputStream, bufferedOutputStream);
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                            } catch (IOException e2) {
                                ((enrr) ((enrr) ((enrr) daez.ag.i()).g(e2)).h("com/google/android/apps/messaging/ui/debug/DebugSmsMmsFromDumpFileDialogFragment", "emailDumpFile", (char) 212, "DebugSmsMmsFromDumpFileDialogFragment.java")).q("emailDumpFile: failed to copy dump file for sharing");
                            }
                            Uri d = cflz.d(z, a.getName());
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("application/octet-stream");
                            intent.putExtra("android.intent.extra.STREAM", d);
                            intent.putExtra("android.intent.extra.SUBJECT", B.getString(R.string.email_sms_mms_dump_file_subject));
                            intent.putExtra("extra_subject_mandatory", true);
                            intent.setFlags(1);
                            daezVar.G().startActivity(Intent.createChooser(intent, B.getString(R.string.email_sms_mms_dump_file_chooser_title)));
                            return;
                        }
                        return;
                    }
                    daez daezVar2 = daeyVar.a;
                    Context context = daeyVar.getContext();
                    if (str2.startsWith("smsdump-")) {
                        SmsMessage[] c = daezVar2.aj.c(str2);
                        if (c.length != 0) {
                            daezVar2.ai.a(null, daezVar2.G(), -1, 0, c, 0L);
                            return;
                        } else {
                            csjy.f("Bugle", "receiveFromDumpFile: invalid sms dump file ".concat(str2));
                            return;
                        }
                    }
                    if (!str2.startsWith("mmsdump-")) {
                        csjy.f("Bugle", "receiveFromDumpFile: invalid dump file name ".concat(str2));
                        return;
                    }
                    covp covpVar = daezVar2.ak;
                    try {
                        byte[] s = covpVar.c.s(str2, context);
                        lx a2 = covp.a(s);
                        ll llVar = new ll();
                        long epochMilli = (covpVar.b.f().toEpochMilli() / 1000) + 600;
                        llVar.a.j(str2.getBytes(), 152);
                        llVar.d(a2.a.a(141));
                        llVar.b(a2.a.c(137));
                        llVar.a.g(a2.a.c(150), 150);
                        llVar.a.h(epochMilli, 136);
                        llVar.a.h(s == null ? 0L : s.length, 142);
                        llVar.a.j(a2.a.k(138), 138);
                        Context context2 = covpVar.a;
                        cpn cpnVar = cbgi.a;
                        Uri.Builder scheme = new Uri.Builder().authority(cbgj.a(context2)).scheme("content");
                        scheme.appendPath(str2);
                        llVar.e(scheme.build().toString().getBytes());
                        bArr = new cgtj(covpVar.a, llVar).b();
                    } catch (covq | li unused) {
                        bArr = null;
                    }
                    if (bArr != null) {
                        if (bArr.length > 0) {
                            byte[] bArr2 = bArr;
                            if (bArr2 != null) {
                                daezVar2.am.a(-1, bArr2, 0L, 0, 0).t();
                                return;
                            } else {
                                csjy.f("Bugle", "receiveFromDumpFile: invalid mms dump file ".concat(str2));
                                return;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Empty or zero length PDU data");
                }
            }
        });
        return textView;
    }
}
