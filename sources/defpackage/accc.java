package defpackage;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.time.ZonedDateTime;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class accc extends TimePickerDialog {
    private final ZonedDateTime a;
    private final ZonedDateTime b;

    public accc(Context context, TimePickerDialog.OnTimeSetListener onTimeSetListener, int i, int i2, boolean z, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        super(context, onTimeSetListener, i, i2, z);
        this.a = zonedDateTime;
        this.b = zonedDateTime2;
    }

    @Override // android.app.TimePickerDialog, android.widget.TimePicker.OnTimeChangedListener
    public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
        if (!this.b.withHour(i).withMinute(i2).toInstant().isBefore(Instant.ofEpochMilli(this.a.toInstant().toEpochMilli()))) {
            getButton(-1).setEnabled(true);
        } else {
            Toast.makeText(getContext(), R.string.datetime_picker_invalid_time_error_toast, 0).show();
            getButton(-1).setEnabled(false);
        }
    }
}
