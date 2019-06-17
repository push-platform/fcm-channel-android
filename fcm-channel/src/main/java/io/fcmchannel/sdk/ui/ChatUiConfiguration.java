package io.fcmchannel.sdk.ui;

import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;

import io.fcmchannel.sdk.FcmClient;

import static io.fcmchannel.sdk.ui.UiConfiguration.INVALID_VALUE;

public class ChatUiConfiguration {

    private int sentMessageBackground = INVALID_VALUE;
    private int receivedMessageBackground = INVALID_VALUE;
    private int sentMessageBackgroundColor = INVALID_VALUE;
    private int receivedMessageBackgroundColor = INVALID_VALUE;
    private int sentMessageTextColor = INVALID_VALUE;
    private int receivedMessageTextColor = INVALID_VALUE;
    private int sendMessageIconColor = INVALID_VALUE;
    private int receivedMessageIcon = INVALID_VALUE;
    private boolean receivedMessageIconOnTop = false;
    private int metadataBackground = INVALID_VALUE;
    private int metadataBackgroundColor = INVALID_VALUE;
    private int chatBackgroundColor = INVALID_VALUE;
    private int chatBackgroundImage = INVALID_VALUE;

    @DrawableRes
    public int getSentMessageBackground() {
        return sentMessageBackground;
    }

    public ChatUiConfiguration setSentMessageBackground(@DrawableRes int sentMessageBackground) {
        this.sentMessageBackground = sentMessageBackground;
        return this;
    }

    @DrawableRes
    public int getReceivedMessageBackground() {
        return receivedMessageBackground;
    }

    public ChatUiConfiguration setReceivedMessageBackground(@DrawableRes int receivedMessageBackground) {
        this.receivedMessageBackground = receivedMessageBackground;
        return this;
    }

    @ColorInt
    public int getSentMessageBackgroundColor() {
        return sentMessageBackgroundColor;
    }

    public ChatUiConfiguration setSentMessageBackgroundColor(@ColorInt int sentMessageBackgroundColor) {
        this.sentMessageBackgroundColor = sentMessageBackgroundColor;
        return this;
    }

    @ColorInt
    public int getReceivedMessageBackgroundColor() {
        return receivedMessageBackgroundColor;
    }

    public ChatUiConfiguration setReceivedMessageBackgroundColor(@ColorInt int receivedMessageBackgroundColor) {
        this.receivedMessageBackgroundColor = receivedMessageBackgroundColor;
        return this;
    }

    @ColorInt
    public int getSentMessageTextColor() {
        return sentMessageTextColor;
    }

    public ChatUiConfiguration setSentMessageTextColor(@ColorInt int sentMessageTextColor) {
        this.sentMessageTextColor = sentMessageTextColor;
        return this;
    }

    @ColorInt
    public int getReceivedMessageTextColor() {
        return receivedMessageTextColor;
    }

    public ChatUiConfiguration setReceivedMessageTextColor(@ColorInt int receivedMessageTextColor) {
        this.receivedMessageTextColor = receivedMessageTextColor;
        return this;
    }

    @ColorInt
    public int getSendMessageIconColor() {
        return sendMessageIconColor;
    }

    public ChatUiConfiguration setSendMessageIconColor(@ColorInt int sendMessageIconColor) {
        this.sendMessageIconColor = sendMessageIconColor;
        return this;
    }

    @DrawableRes
    public int getReceivedMessageIcon() {
        return receivedMessageIcon != INVALID_VALUE ? receivedMessageIcon : FcmClient.getAppIcon();
    }

    public ChatUiConfiguration setReceivedMessageIcon(@DrawableRes int receivedMessageIcon) {
        this.receivedMessageIcon = receivedMessageIcon;
        return this;
    }

    public boolean isReceivedMessageIconOnTop() {
        return receivedMessageIconOnTop;
    }

    public ChatUiConfiguration setReceivedMessageIconOnTop(boolean receivedMessageIconOnTop) {
        this.receivedMessageIconOnTop = receivedMessageIconOnTop;
        return this;
    }

    @DrawableRes
    public int getMetadataBackground() {
        return metadataBackground;
    }

    public ChatUiConfiguration setMetadataBackground(@DrawableRes int metadataBackground) {
        this.metadataBackground = metadataBackground;
        return this;
    }

    @ColorInt
    public int getMetadataBackgroundColor() {
        return metadataBackgroundColor;
    }

    public ChatUiConfiguration setMetadataBackgroundColor(@ColorInt int metadataBackgroundColor) {
        this.metadataBackgroundColor = metadataBackgroundColor;
        return this;
    }

    @ColorInt
    public int getChatBackgroundColor() {
        return chatBackgroundColor;
    }

    public ChatUiConfiguration setChatBackgroundColor(@ColorInt int chatBackgroundColor) {
        this.chatBackgroundColor = chatBackgroundColor;
        return this;
    }

    @DrawableRes
    public int getChatBackgroundImage() {
        return chatBackgroundImage;
    }

    public ChatUiConfiguration setChatBackgroundImage(@DrawableRes int chatBackgroundImage) {
        this.chatBackgroundImage = chatBackgroundImage;
        return this;
    }

}