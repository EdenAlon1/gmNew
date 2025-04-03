package defpackage;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import j$.time.Instant;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accd implements TimePickerDialog.OnTimeSetListener {
    public static final /* synthetic */ int f = 0;
    public final accf a;
    public final Context b;
    public final acbz c;
    public final ea d;
    public final ffbr e;

    public accd(accf accfVar, acbz acbzVar, ffbr ffbrVar) {
        this.a = accfVar;
        this.b = acbzVar.z();
        this.c = acbzVar;
        ea E = acbzVar.E();
        E.getClass();
        this.d = E;
        this.e = ffbrVar;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        ellj.f(new accs(Instant.ofEpochMilli(this.a.b).atZone(ZoneId.systemDefault()).withHour(i).withMinute(i2)), this.d);
    }
}
