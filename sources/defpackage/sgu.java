package defpackage;

import android.widget.SeekBar;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.shared.audio.attachment.ui.AudioPlaybackSeekBar;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgu implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ AudioPlaybackSeekBar a;
    final /* synthetic */ PausableChronometer b;
    final /* synthetic */ AudioAttachmentView c;

    public sgu(AudioAttachmentView audioAttachmentView, AudioPlaybackSeekBar audioPlaybackSeekBar, PausableChronometer pausableChronometer) {
        this.a = audioPlaybackSeekBar;
        this.b = pausableChronometer;
        this.c = audioAttachmentView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.a.a();
            this.b.c(this.a.d);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        ellj.g(new arci(this.c), seekBar);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.a();
        ellj.g(new arcj(Duration.ofMillis(this.a.d), this.c), seekBar);
    }
}
