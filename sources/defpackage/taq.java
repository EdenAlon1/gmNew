package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class taq implements tap {
    private final ddzb a;

    public taq(ddzb ddzbVar) {
        this.a = ddzbVar;
    }

    @Override // defpackage.tap
    public final Intent a(crtd crtdVar) {
        Intent data = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI);
        crsz crszVar = (crsz) crtdVar;
        data.putExtra("beginTime", crszVar.a.longValue());
        data.putExtra("endTime", crszVar.b.longValue());
        String str = crszVar.c;
        if (str != null) {
            data.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, str);
        }
        String str2 = crszVar.d;
        if (str2 != null) {
            data.putExtra("description", str2);
        }
        String str3 = crszVar.e;
        if (str3 != null) {
            data.putExtra("eventLocation", str3);
        }
        String str4 = crszVar.f;
        if (str4 != null) {
            data.putExtra("rrule", str4);
        }
        return data;
    }

    @Override // defpackage.tap
    public final void b(Context context, Uri uri) {
        int i = cbgl.a;
        csix.k(uri != null && TextUtils.equals(uri.getScheme(), "content") && uri.getAuthority().equals(cbgn.a(context)));
        try {
            Uri a = cbgl.a(uri);
            if (a == null) {
                throw new FileNotFoundException(String.format("Invalid proxy uri : %s", uri.getPath()));
            }
            InputStream fileInputStream = cbgi.k(a, context) ? new FileInputStream(cbgi.i(a, context)) : cbgl.c(context, a);
            try {
                crtd c = new crtc().c(fileInputStream);
                if (c == null) {
                    csjy.f("Bugle", "Return null for event from file!");
                    if (fileInputStream == null) {
                        return;
                    }
                } else {
                    this.a.q(context, a(c));
                    if (fileInputStream == null) {
                        return;
                    }
                }
                fileInputStream.close();
            } finally {
            }
        } catch (IOException e) {
            csjy.h("Bugle", e, "Fail to read the calendar file");
        }
    }
}
